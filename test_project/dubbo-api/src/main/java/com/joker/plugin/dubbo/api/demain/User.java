package com.joker.plugin.dubbo.api.demain;

import lombok.*;

import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: Joker
 * @CreateDate: 2018/12/10 10:10
 * @UpdateUser: Joker
 * @UpdateDate: 2018/12/10 10:10
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private static final long serialVersionUID = -1265363080528793675L;

    /**
     * 会员编号
     */
    private String userId;

    /**
     * 会员手机号
     */
    private String mobile;

    /**
     * 会员密码
     */
    private String tmpPassword;

    /**
     * openIds
     */
    private List<String> openIds;

    /**
     * 会员概要
     */
    private UserProfile tmpProfile;


    public static void main(String[] args) {
        User user = new User();
    }


}
