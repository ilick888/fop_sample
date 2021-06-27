package fop;

import java.io.Reader;
import java.util.List;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

public class ItemDao {

    public List<Item> read(Reader reader) throws CsvException, CsvRequiredFieldEmptyException {
        CsvToBean<Item> csvToBean = new CsvToBeanBuilder<Item>(reader).withType(Item.class).build();
        return csvToBean.parse();
    }

}