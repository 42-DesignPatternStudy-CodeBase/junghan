package proxyPattern;

public class PrinterProxy implements Printable { 
    private String name; // 이름 
    private Printer real; // "본인" 
    public PrinterProxy() {
    }
    public PrinterProxy(String name) {  // 생성자
        this.name = name;
    }
    
    public synchronized void setPrinterName(String name) { // 이름의 설정
       //Todo
    	if (this.real != null) //real의 name을 동기화
    		this.real.setPrinterName(name);
        System.out.println("proxy : setPrinterName()"); 
        this.name = name;
    }
    
    public String getPrinterName() { // 이름의 취득 
        System.out.println("proxy : getPrinterName()"); 
        return this.name;
    }

    public void print(String string) { // 표시
    	this.realize();
    	this.real.print(string);
       //Todo
    }

    private synchronized void realize() { // "본인"을 생성
    	//생성이 되어있으면 생성자 호출 x 생성자가 두번 호출
    	if (this.real == null)
    		this.real = new Printer(this.name);
        //Todo
    }
}
