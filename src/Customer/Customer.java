package Customer;

public class Customer
{
   private String name;
    private String phone;
    private String emailAddress;

    // Constructor
    public Customer(String name, String phone, String emailAddress)
    {
        this.name = name;
        this.phone = phone;
        this.emailAddress = emailAddress;
    }

    // Getters
    public String getName()
    {
        return name;
    }

    public String getPhone()
    {
        return phone;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    // Setters
    public void setName(String name)
    {
        this.name = name;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }

    // toString
    public String toString()
    {
        return "Customer{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

    // equals
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        Customer customer = (Customer) obj;
        return name.equals(customer.name) && phone.equals(customer.phone) && emailAddress.equals(customer.emailAddress);
    }
    
}

