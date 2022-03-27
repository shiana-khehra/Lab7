package ca.sait.lab7.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 * Represents a role
 * 
 * @author Shiana Khehra
 */
@Entity
@Table(name = "role")
@NamedQueries({
    @NamedQuery(name = "Role.findAll", query = "SELECT r FROM Role r")})
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic
    @Column(name = "role_id")
    private int roleId;
    @Column(name = "role_name")
    private String roleName;
    @OneToMany
    private List<User> userList;

    public Role() {
    }

    public Role(int roleId) {
        this.roleId = roleId;
    }

    public Role(int roleId, String roleName) {
        this.roleId = roleId;
        this.roleName = roleName;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
