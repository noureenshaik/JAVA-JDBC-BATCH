package MultipleInheritanceEx1;

interface One {
    public void print_geek();
}

interface two {
    public void print_for();
}

interface three extends One, two {
    public void print_geek();
}