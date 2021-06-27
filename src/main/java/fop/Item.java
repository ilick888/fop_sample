package fop;

import com.opencsv.bean.CsvBindByPosition;
import lombok.Data;

@Data
public class Item {

    @CsvBindByPosition(position = 0, required = true)
    private String id;

    @CsvBindByPosition(position = 1, required = true)
    private String name;

    @CsvBindByPosition(position = 2, required = true)
    private int price;

    @CsvBindByPosition(position = 3, required = true)
    private int amount;

}