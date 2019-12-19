package cn.edu.sysu.workflow.entity.access;

import java.util.UUID;

/**
 * Association of Role and Account of BooWFMS
 *
 * Created by Skye on 2019/12/18.
 */
public class RoleAccount {

    private final String PREFIX = "ra-";

    /**
     * 角色账号关联表主键
     */
    private String roleAccountId;

    /**
     * 角色ID
     */
    private String roleId;

    /**
     * 对应账户ID
     */
    private String accountId;

    public RoleAccount() {
        this.roleAccountId = PREFIX + UUID.randomUUID().toString();
    }

    public String getPREFIX() {
        return PREFIX;
    }

    public String getRoleAccountId() {
        return roleAccountId;
    }

    public void setRoleAccountId(String roleAccountId) {
        this.roleAccountId = roleAccountId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
}