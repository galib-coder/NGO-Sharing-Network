package dao;

import db.DBConnection;
import model.Resource;

import java.sql.*;
import java.util.*;

public class ResourceDAO {

    public void addResource(Resource res) {
        String sql = "INSERT INTO resources (ngo_name, resource_type, quantity, description) VALUES (?, ?, ?, ?)";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, res.getNgoName());
            ps.setString(2, res.getResourceType());
            ps.setInt(3, res.getQuantity());
            ps.setString(4, res.getDescription());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Resource> getAllResources() {
        List<Resource> list = new ArrayList<>();
        String sql = "SELECT * FROM resources";
        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                Resource r = new Resource(
                    rs.getString("ngo_name"),
                    rs.getString("resource_type"),
                    rs.getInt("quantity"),
                    rs.getString("description")
                );
                r.setId(rs.getInt("id"));
                list.add(r);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
