//package com.sunli.sale.shiro;
//
//import org.apache.shiro.authc.*;
//import org.apache.shiro.authz.AuthorizationInfo;
//import org.apache.shiro.authz.SimpleAuthorizationInfo;
//import org.apache.shiro.realm.AuthorizingRealm;
//import org.apache.shiro.subject.PrincipalCollection;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class AuthRealm extends AuthorizingRealm {
//    @Autowired
//    private Service service;
//
//    //认证.登录
//    @Override
//    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
//        UsernamePasswordToken utoken=(UsernamePasswordToken) token;//获取用户输入的token
//        String username = utoken.getUsername();
//        Users user = null;
//        try {
//            user = service.queryUsers(1);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return new SimpleAuthenticationInfo(user.getName(), user.getPassWord(),this.getClass().getName());//放入shiro.调用CredentialsMatcher检验密码
//    }
//    //授权
//    @Override
//    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {
//        Object user=principal.fromRealm(this.getClass().getName()).iterator().next();//获取session中的用户
//        List<String> permissions=new ArrayList<>();
////        Set<Role> roles = user.getRoles();
////        if(roles.size()>0) {
////            for(Role role : roles) {
////                Set<Module> modules = role.getModules();
////                if(modules.size()>0) {
////                    for(Module module : modules) {
////                        permissions.add(module.getMname());
////                    }
////                }
////            }
////        }
//        permissions.add("admin");
//        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
//        info.addStringPermissions(permissions);//将权限放入shiro中.
//        return info;
//    }
//}
