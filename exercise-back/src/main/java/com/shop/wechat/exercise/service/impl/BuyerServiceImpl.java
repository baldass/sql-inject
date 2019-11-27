package com.shop.wechat.exercise.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.shop.wechat.exercise.common.SystemParam;
import com.shop.wechat.exercise.common.exception.DockingException;
import com.shop.wechat.exercise.common.wechat.WxLogin;
import com.shop.wechat.exercise.common.wechat.code.ErrCode;
import com.shop.wechat.exercise.dao.BuyerRepository;
import com.shop.wechat.exercise.dto.BuyerDto;
import com.shop.wechat.exercise.entity.BuyerEntity;
import com.shop.wechat.exercise.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

@Service
public class BuyerServiceImpl implements BuyerService {
    @Autowired
    private BuyerRepository buyerRepository;

    @Autowired
    private SystemParam systemParam;
    @Autowired
    private WxLogin wxLogin;

    @Override
    public Map<String, Object> login(String code) throws DockingException {
        Map<String, Object> map = new HashMap<>();
        JSONObject session = wxLogin.login(code);

        String errcode = session.getString("errcode");
        /*
        errcode值说明
        -1      系统繁忙，此时请开发者稍候再试
        0       请求成功
        40029   code 无效
        45011   频率限制，每个用户每分钟100次
         */
        if (!"0".equals(errcode)) {
            throw new DockingException("500", ErrCode.getMsg(errcode));
        }
        String errmsg = session.getString("errmsg");
        String openid = session.getString("openid");
        String session_key = session.getString("session_key");
        String unionid = session.getString("unionid");
        if (!StringUtils.isEmpty(openid)) {
            throw new DockingException("500", "获取微信openid失败");
        }
//            BuyerEntity buyer = buyerRepository.findByOpenid(openid);
        BuyerEntity buyer = buyerRepository.findByOpenid(openid);
        if (buyer == null) {
            //新用户,直接自动注册
            buyer = new BuyerEntity();
            buyer.setOpenid(openid);
            buyer.setSessionKey(session_key);
            buyer.setName("新用户");
            buyer.setNickName("新用户");
            buyer.setCredit(0);
            BuyerEntity save = buyerRepository.save(buyer);
            String id = save.getId();
            map.put("id", id);
            map.put("is_new", "1");
        } else {
            //老用户返回id
            map.put("id", buyer.getId());
            map.put("is_new", "0");
        }
        return map;
    }

    @Override
    public BuyerDto findBuyerByOpenId(String openId) {
        BuyerEntity entity = buyerRepository.findByOpenid(openId);
        return BuyerDto.getBuyer(entity);
    }

    @Override
    public String saveBuyerInfo(BuyerDto buyer) {
        if (StringUtils.isEmpty(buyer.getBuyer_id())) {
            //没有id则直接保存并返回id
            BuyerEntity entity = BuyerDto.createEntity(buyer);
            //获取openid和sessionKey

        } else {

        }
        return null;
    }
}
