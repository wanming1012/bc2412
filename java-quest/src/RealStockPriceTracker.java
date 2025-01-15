import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class RealStockPriceTracker {
  // You should complete StockPriceTracker first.
  
  // In RealStockPriceTracker, we should consider the stock price is by Stock Code & Trade date
  // For example, the stock price of GOOGL on 13 Jan is $191.01

  // Tips: You should still use PriorityQueue, HashMap, Deque

  // Complete getHighestPrice(String stockCode) and getLatestPrice(String stockCode)

  private final Map<String, StockPriceTracker> stockRecords = new HashMap<>();

  public void addRecord(String stockCode, LocalDate date, double price) {
    StockPriceTracker tracker = this.stockRecords.get(stockCode);
    if (tracker == null) {
      tracker = new StockPriceTracker();
      this.stockRecords.put(stockCode, tracker);
    }

    tracker.addRecord(date, price);
  }

  public double getLatestPrice(String stockCode) {
    StockPriceTracker tracker = this.stockRecords.get(stockCode);
    if (tracker != null)
      return tracker.getLatestPrice();
    return -1.0;
  }

  public double getHighestPrice(String stockCode) {
    StockPriceTracker tracker = this.stockRecords.get(stockCode);
    if (tracker != null)
      return tracker.getHighestPrice();
    return -1.0;
  }

  public static void main(String[] args) {
    RealStockPriceTracker tracker = new RealStockPriceTracker();

    // code here ... for testing
    tracker.addRecord("Google", LocalDate.of(2024, 1, 1), 100.50);
    tracker.addRecord("Google", LocalDate.of(2024, 1, 2), 200.75);
    tracker.addRecord("Google", LocalDate.of(2024, 1, 3), 150.25);
    tracker.addRecord("Google", LocalDate.of(2024, 1, 4), 199.99);

    tracker.addRecord("Apple", LocalDate.of(2024, 1, 1), 99.50);
    tracker.addRecord("Apple", LocalDate.of(2024, 1, 2), 120.75);
    tracker.addRecord("Apple", LocalDate.of(2024, 1, 3), 80.25);
    tracker.addRecord("Apple", LocalDate.of(2024, 1, 4), 120.75);

    System.out.println("Google Latest price: $" + tracker.getLatestPrice("Google")); // Output: 150.25
    System.out.println("Google Highest price: $" + tracker.getHighestPrice("Google")); // Output: 200.75

    System.out.println("Apple Latest price: $" + tracker.getLatestPrice("Apple")); // Output: 150.25
    System.out.println("Apple Highest price: $" + tracker.getHighestPrice("Apple")); // Output: 200.75

  }

}