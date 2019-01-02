package com.leoncode;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;


//控制器
public class LoginController {

    @FXML
    private TextField loginName;

    @FXML
    private PasswordField password;


    public void loginSubmit(ActionEvent event){
       String  name = loginName.getText();
       String  pw = password.getText();
       if(name.equals("admin")){
            if(pw.equals("123456")){
                System.out.println("登录成功");
            }else{
                System.out.println("登录失败");
            }
       }else{
           System.out.println("用户不存在");
       }
    }


}
