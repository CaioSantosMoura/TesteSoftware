package org.example;

public class OrderService {

    public PaymentService paymentService;
    public InvoiceService invoiceService;

    // Construtor para injetar dependências
    public OrderService(PaymentService paymentService, InvoiceService invoiceService) {
        this.paymentService = paymentService;
        this.invoiceService = invoiceService;
    }

    // Método que proessa um pedido, realizando pagamento e envio de fatura
    public boolean processOrder(String accountNumber, double amount, String email) {
        boolean paymentProcessed = paymentService.processPayment(accountNumber, amount);
        if (paymentProcessed) {
            return invoiceService.sendInvoice(email, "Fatura para o valor de " + amount);
        }
        return false; // Falha no processamento do pedido
    }
}
