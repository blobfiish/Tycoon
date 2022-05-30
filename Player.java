public class Player {
  private String role = "";
  private boolean isComputer;
  private String name = "";

  public Player(boolean isComputer, String name) {
    this.isComputer = isComputer;
    role = "commoner";
    this.name = name;
  }

  public String getRole() {
    return role;
  }
  public String getName() {
    return name;
  }
  public void setRole(String newRole) {
    this.role = newRole;
  }
  public void setName(String newName) {
    this.name = newName;
  }
  public String toString() {
    return name + " is a " + role;
  }
}