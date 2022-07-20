import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Things implements Baskets {

  final List<String> cars = new ArrayList<>(Arrays.asList("BMW", "AUDI", "VOLKSWAGEN"));
  final List<String> fruits = new ArrayList<>(Arrays.asList("APPLE", "BANANA"));
  final List<String> cycles = new ArrayList<>(Arrays.asList("HERCULES"));
  List<String> carList = new ArrayList<>();
  List<String> fruitList = new ArrayList<>();
  List<String> cycleList = new ArrayList<>();
  List<String> unknownList = new ArrayList<>();
  String str = "";
  boolean state;

  Things(List<String> entries) {
    entries.stream()
        .forEach(
            e -> {
              this.str = e;
              this.state = false;
              car();
              fruit();
              cycle();
              unknown();
            });
    System.out.println("Car List" + this.carList);
    System.out.println("Fruit List" + this.fruitList);
    System.out.println("Cycle List" + this.cycleList);
    System.out.println("Unknown List" + this.unknownList);
  }

  @Override
  public void car() {
    if (cars.contains(str)) {
      carList.add(str);
      state = true;
    }
  }

  @Override
  public void fruit() {
    if (fruits.contains(str)) {
      fruitList.add(str);
      state = true;
    }
  }

  @Override
  public void cycle() {
    if (cycles.contains(str)) {
      cycleList.add(str);
      state = true;
    }
  }

  @Override
  public void unknown() {
    if (!state) {
      this.unknownList.add(str);
    }
  }
    }