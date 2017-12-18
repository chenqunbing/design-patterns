public abstract class RoleBuilder {
    protected Role role = new Role();
    public abstract void buildeSex();
    public abstract void buildeFace();
    public abstract void buildeClothing();
    public abstract void buildeHairStyle();
    public Role getRole() {
        return role;
    }
}