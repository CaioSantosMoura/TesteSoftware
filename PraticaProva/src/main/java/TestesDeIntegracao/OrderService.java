package TestesDeIntegracao;

public class OrderService {
    private InventoryService inventoryService;

    public OrderService(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    public boolean placeOrder(String product, int quantity) {
        if (inventoryService.isProductAvailable(product, quantity)) {
            return true;
        }
        return false;
    }
}
