import dtos.Child1;
import dtos.Child2;
import dtos.Parent;
import service.impl.Service;
import service.registry.Registry;
import strategypattern.Fraction;
import strategypattern.context.Order;
import strategypattern.payment.PayByCreditCard;
import strategypattern.payment.PayByPaypal;
import strategypattern.payment.PayStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Order order = new Order();
    private static PayStrategy strategy;

    static {
        priceOnProducts.put(1, 2200);
        priceOnProducts.put(2, 1850);
        priceOnProducts.put(3, 1100);
        priceOnProducts.put(4, 890);
    }

    public boolean isEmpty(String s) {
        return s.isEmpty();
    }

    public static void main(String[] args) throws IOException {
        System.out.println("test");
//        while (!order.isClosed()) {
//            int cost;
//            String continueChoice;
//            do {
//                System.out.print("Please, select a product:" + "\n" +
//                        "1 - Mother board" + "\n" +
//                        "2 - CPU" + "\n" +
//                        "3 - HDD" + "\n" +
//                        "4 - Memory" + "\n");
//                int choice = Integer.parseInt(reader.readLine());
//                cost = priceOnProducts.get(choice);
//                System.out.print("Count: ");
//                int count = Integer.parseInt(reader.readLine());
//                order.setTotalCost(cost * count);
//                System.out.print("Do you wish to continue selecting products? Y/N: ");
//                continueChoice = reader.readLine();
//            } while (continueChoice.equalsIgnoreCase("Y"));
//            if (strategy == null) {
//                System.out.println("Please, select a payment method:" + "\n" +
//                        "1 - PalPay" + "\n" +
//                        "2 - Credit Card");
//                String paymentMethod = reader.readLine();
//                if (paymentMethod.equals("1")) {
//                    strategy = new PayByPaypal();
//                } else {
//                    strategy = new PayByCreditCard();
//                }
//                order.processOrder(strategy);
//                System.out.print("Pay " + order.getTotalCost() + " units or Continue shopping? P/C: ");
//                String proceed = reader.readLine();
//                if (proceed.equalsIgnoreCase("P")) {
//                    // Finally, strategy handles the payment.
//                    if (strategy.pay(order.getTotalCost())) {
//                        System.out.println("Payment has been successful.");
//                    } else {
//                        System.out.println("FAIL! Please, check your data.");
//                    }
//                    order.setClosed();
//                }
//            }
//        }


    }
}