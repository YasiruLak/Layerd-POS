package lk.ijse.pos.dao.custom.impl;

import lk.ijse.pos.dao.custom.QueryDAO;
import lk.ijse.pos.dto.CustomDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class QueryDAOImpl implements QueryDAO {
    @Override
    public ArrayList<CustomDTO> getOrderDetailsFromOrderID(String oid) throws SQLException, ClassNotFoundException {
        return null;
    }
}
