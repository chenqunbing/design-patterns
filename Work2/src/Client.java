public class Client {
    public static void main(final String[] a) {
        RoleBuilder roleBuilder = (RoleBuilder) XMLUtil.getBean();
        RoleController roleController = new RoleController();
        roleController.setRoleBuilder(roleBuilder);
        Role role = roleController.construct();
        System.out.println("创建人物角色:");
        System.out.println(role.getSex());
        System.out.println(role.getFace());
        System.out.println(role.getClothing());
        System.out.println(role.getHairStyle());
    }
}