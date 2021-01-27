package com.joker.plugin.dubbo.api.demain;


import com.caucho.hessian.io.Hessian2Input;
import com.caucho.hessian.io.Hessian2Output;
import com.caucho.hessian.io.HessianInput;
import com.caucho.hessian.io.HessianOutput;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;

public class SerialTest {

    public static <T> byte[] serialize(T t){
        byte[] data = null;
        try {
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            HessianOutput output = new HessianOutput(os);
            output.writeObject(t);
            data = os.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    public static <T> byte[] serialize2(T t){
        byte[] data = null;
        try {
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            Hessian2Output output = new Hessian2Output(os);
            output.writeObject(t);
            output.getBytesOutputStream().flush();
            output.completeMessage();
            output.close();
            data = os.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    public static <T> byte[] jdkSerialize(T t){
        byte[] data = null;
        try {
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            ObjectOutputStream output = new ObjectOutputStream(os);
            output.writeObject(t);
            output.flush();
            output.close();
            data = os.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    @SuppressWarnings("unchecked")
    public static <T> T deserialize(byte[] data){
        if(data==null){
            return null;
        }
        Object result = null;
        try {
            ByteArrayInputStream is = new ByteArrayInputStream(data);
            HessianInput input = new HessianInput(is);
            result = input.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T)result;
    }

    @SuppressWarnings("unchecked")
    public static <T> T deserialize2(byte[] data){
        if(data==null){
            return null;
        }
        Object result = null;
        try {
            ByteArrayInputStream is = new ByteArrayInputStream(data);
            Hessian2Input input = new Hessian2Input(is);
            result = input.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T)result;
    }

    public static void main(String[] args) {
        UserProfile userProfile = new UserProfile();
        userProfile.setLogo("头像");
        userProfile.setNickName("昵称(微信昵称、手机号码)");
        userProfile.setBirthday("");
        byte[] obj = serialize(userProfile);
        System.out.println("hessian serialize result length = "+obj.length);
        byte[] obj2 = serialize2(userProfile);
        System.out.println("hessian2 serialize result length = "+obj2.length);
        byte[] other = jdkSerialize(userProfile);
        System.out.println("jdk serialize result length = "+other.length);
        UserProfile userProfile1 = deserialize2(obj2);
        System.out.println("deserialize result entity is "+userProfile1);


        final byte a = 127;
    }


}
