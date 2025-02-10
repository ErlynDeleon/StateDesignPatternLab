public interface AccountState {
    public void deposit(Account account , Double amount);
    public void withdraw(Account account , Double amount);
    public void activate(Account account);
    public void suspend(Account account);
    public void close(Account account);

}