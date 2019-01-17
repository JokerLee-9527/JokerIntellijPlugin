package com.joker.plugin.dubbo.api.demain;

import lombok.*;

/**
* @Description:    会员概要 信息
*
* @Author:         Joker
* @CreateDate:     2018/12/10 10:42
* @UpdateUser:     Joker
* @UpdateDate:     2018/12/10 10:42
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserProfile {

    private static final long serialVersionUID = 8840160773006888780L;

    //头像 
    private String logo;

    //昵称 (微信昵称、手机号码)
    private String nickName;

    //生日 
    private String birthday;

}
