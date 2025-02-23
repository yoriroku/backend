package data.user;

import data.product.Type;

import java.util.List;

public class User {
    public long id;
    public String name;
    public String email;
    public String phone;
    public List<Type> excludeProductTypes;
}
