public class ActivateState implements AccountState{

    @Override
    public void deposit(Account account, Double amount) {
        account.setBalance(account.getBalance() + amount);
    }

    @Override
    public void withdraw(Account account, Double amount) {
        account.setBalance(account.getBalance() - amount);
    }

    @Override
    public void activate(Account account) {
        System.out.println("Account is already activated!");
    }

    @Override
    public void suspend(Account account) {
        System.out.println( "Account is suspended!");
        account.setAccountState(new SuspendedState());
        
    }

    @Override
    public void close(Account account) {
        System.out.println("Account is closed!");
        account.setAccountState(new ClosedState());

    }
}