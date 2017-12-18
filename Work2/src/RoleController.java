public class RoleController {
    private RoleBuilder roleBuilder;

    public void setRoleBuilder(final RoleBuilder roleBuilder) {
        this.roleBuilder = roleBuilder;
    }

    public Role construct() {
        roleBuilder.buildeSex();
        roleBuilder.buildeFace();
        roleBuilder.buildeClothing();
        roleBuilder.buildeHairStyle();
        return roleBuilder.getRole();
    }
}