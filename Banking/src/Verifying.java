public class Verifying
{
  private String user;
  private String pass;
  private boolean verifiying;
  
  public final String getUser()
  {
    return this.user;
  }
  
  public final void setUser(String user)
  {
    this.user = user;
  }
  
  public final String getPass()
  {
    return this.pass;
  }
  
  public final void setPass(String pass)
  {
    this.pass = pass;
  }
  
  public boolean isVerifiying()
  {
    DBService db = new DBService();
    if (db.check(this.user, this.pass)) {
      setVerifiying(true);
    } else {
      setVerifiying(false);
    }
    return this.verifiying;
  }
  
  private void setVerifiying(boolean verifiying)
  {
    this.verifiying = verifiying;
  }
}
