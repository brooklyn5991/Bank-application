BankApp: My Journey into the Spring Context
Welcome to my repository! This project is a hands-on exploration of the Spring Framework, specifically focusing on how Spring manages object 
lifecycles so I don't have to.

I'm currently building this as part of my journey through the book "Spring Start Here" by Laurențiu Spilca.

The Goal
The mission was simple: Stop using the new keyword everywhere and let Spring take the wheel. I wanted to create a Bank Account that wasn't just 
an empty shell but was "born ready" with data.

What I Learned Today
1. The @Component Revelation
I used to think I had to manually instantiate every class. By adding @Component to my Account.java, I effectively "registered" it with the Spring
Context.

The Result: Spring finds the class, builds the object, and keeps it in its "warehouse" (the Context) until I need it.

2. The @PostConstruct Magic
When Spring creates a bean, it uses the default constructor, which often leaves fields like name or balance as null or 0.

The Fix: I used @PostConstruct to create an initialization "Wizard." The moment Spring finishes building the object, it automatically runs my 
get method to set the account name and number.

💻 The Code at a Glance
In Account.java, I’ve got a self-initializing bean:

Java

@Component
public class Account {
    private String name;
    private String accountNumber;

    @PostConstruct
    public void init() {
        this.name = "Oke";
        this.accountNumber = "2635477132";
        System.out.println(" Account Bean is live and initialized!");
    }
}
 How to Run It
Clone the repo.

Ensure you have Maven and Java 17 installed.

Run Main.java.

Watch the console—you'll see Spring initializing the bean before the Main method even asks for it!

Acknowledgments
A huge thanks to Laurențiu Spilca for his book Spring Start Here. It’s turning "magic" into logic for me.
 What's Next?
I’m moving on to Dependency Injection. I want to see how I can make a BankService automatically "find" this Account without me having to pass it manually.

Keep watching this space! 
