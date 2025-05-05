package SaliganJava_LabExercises;

public class Invoice {
	
	//=====
	
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double price;
    
    //=====
    
    public Invoice(String a, String b, int c, Double d){
        this.partNumber = a;
        this.partDescription = b;
        this.quantity = c;
        this.price = d;
    }
    
    //=====
    
    public static void getInvoice(int a, Double b){
    	if (a<0) {
    		a = 0; }
    	if (b<0) {
    		b = 0.0; }
        System.out.printf("Invoice amount is: %.2f", a * b);
    }
    
    //=====
    
    public String getPartNumber(){
        return this.partNumber;
    }
    
    //=====
    
    public void setPartNumber(String partNumber){
        this.partNumber = partNumber;
    }
    
    //=====
    
    public String getPartDescription(){
        return this.partDescription;
    }
    
    //=====
    
    public void setPartDescription(String partDescription){
        this.partDescription = partDescription;
    }
    
    //=====
    
    public int getQuantity(){
        return this.quantity;
    }
    
    //=====
    
    public void setQuantity(int quantity){
    	this.quantity = quantity; 
    }
    
    //=====
    
    public Double getPrice(){
        return this.price;
    }
    
    //=====
    
    public void setPrice(Double price){
    	this.price = price; 
    }
    
    //=====
}