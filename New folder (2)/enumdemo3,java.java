enum book{
    science(100), math(467);
    private int price;
    book(int p)
    {
        price=p;
    }
    int getprice()
    {
        return price;
    }

}
class enumdemo3
{
    public static void main(String[] args) {
        book b;
        b=book.science;
        System.out.println(b);
        for(book c: book.values()){
        System.out.println(c);
        System.out.println(c.getprice());}
        
        System.out.println(book.valueOf("math"));

    }
}