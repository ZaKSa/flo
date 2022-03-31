package com.flo.flo.DAO;

import com.flo.flo.models.Plans_products_ID;

import java.util.List;

public interface PlansProductsIdDAO {
    List<Plans_products_ID> allPlansProductsId();
    void add_ppi(Plans_products_ID PlansProductsId);
    void delete_ppi(Plans_products_ID PlansProductsId);
    void edit_ppi(Plans_products_ID PlansProductsId);
    Plans_products_ID getById_ppi(int id);
}
