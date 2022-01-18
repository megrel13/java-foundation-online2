package homework.ThisFinalSuper;

import lombok.*;

import java.util.Objects;

@Data
@Setter
@Getter
@AllArgsConstructor
public class Bird {
    private String name;
    private String colour;

//  @Override
//  public boolean equals(Object o) {     // получаем некоторый объект на вход
//      if (this == o) return true;       // если мы ссылаемся на один и тот же объект мы возвращаем true
//      if (o == null || getClass() != o.getClass()) return false; // Если входящий объект равен наллу или экзаемпляр класса не равен экземплярук входящего обекта то возвращаем false
//      Bird bird = (Bird) o;  // явно приводим тип данных
//      return canTalk == bird.canTalk &&
//              flyAbility == bird.flyAbility &&  // возвращаем и сравниваем через equals поля.
//              name.equals(bird.name) &&
//              colour.equals(bird.colour) &&
//              size.equals(bird.size);
//  }

//  @Override
//  public String toString() {
//      return "Bird{" +
//              "name='" + name + '\'' +
//              ", colour='" + colour + '\'' +
//              '}';
//  }

    //  @Override
    //  public int hashCode() {
    //      return Objects.hash(name);
    //  }

    //  private String size;
    //  private boolean canTalk;
    //  private boolean flyAbility;

    //  public Bird(String name, String colour, String size) {
    //      this.name = name;
    //      this.colour = colour;
    //      this.size = size;
    //  }


///   public String getName() {
///       return name;
///   }

///   public void setName(String name) {
///       this.name = name;
///   }

///   public String getColour() {
///       return colour;
///   }

///   public void setColour(String colour) {
///       this.colour = colour;
///   }

///   public String getSize() {
///       return size;
///   }

///   public void setSize(String size) {
///       this.size = size;
///   }


}
