package lk.ijse.pos.dao.custom;

import lk.ijse.pos.dao.SuperDAO;
import lk.ijse.pos.dto.ItemCountDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface QueryDAO extends SuperDAO {
    ArrayList<ItemCountDTO> getOrderDetailsFromOrderID(String oid) throws SQLException, ClassNotFoundException;

}
