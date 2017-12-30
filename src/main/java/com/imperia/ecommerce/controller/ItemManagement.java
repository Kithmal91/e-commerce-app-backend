package com.imperia.ecommerce.controller;

import com.imperia.ecommerce.common.WSPath;
import com.imperia.ecommerce.dto.ItemDto;
import com.imperia.ecommerce.entity.Item;
import com.imperia.ecommerce.repository.CategoryRepository;
import com.imperia.ecommerce.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * All the operations regarding items
 * Created by Kithmal on 12/29/17.
 */
@RequestMapping(WSPath.ITEM)
@RestController
public class ItemManagement {

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    CategoryRepository categoryRepository;

    /**
     * Save Item
     *
     * @param itemDto
     * @return
     */
    @RequestMapping(path = WSPath.ITEM_SAVE, method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Item> save(@RequestBody ItemDto itemDto) {

        Item item = new Item();
        item.setDescription(itemDto.getDescription());
        item.setStatus(itemDto.getStatus());
        item.setHeight(itemDto.getHeight());
        item.setImageRefId(itemDto.getImageRefId());
        item.setItemName(itemDto.getItemName());
        item.setQuantity(itemDto.getQuantity());
        item.setReferenceId(itemDto.getReferenceId());
        item.setRetailPrice(itemDto.getRetailPrice());
        item.setWeight(itemDto.getWeight());
        item.setWidth(itemDto.getWidth());
        item.setCategory(categoryRepository.findOne(itemDto.getItemCategoryId()));

        Item exItem = itemRepository.save(item);
        return ResponseEntity.ok(exItem);
    }

    /**
     * Get All the items
     *
     * @return
     */
    @RequestMapping(path = WSPath.ITEM_GET_ALL, method = RequestMethod.GET)
    @ResponseBody
    public List<Item> getAll() {

        Iterable<Item> itemList = itemRepository.findAll();
        List<Item> list = new ArrayList<>();
        itemList.forEach(list::add);

        return list;
    }

    /**
     * Get Item By ID
     *
     * @param itemDto
     * @return
     */
    @RequestMapping(path = WSPath.ITEM_GET_BY_ID, method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Item> getById(ItemDto itemDto) {

        Item item = itemRepository.findOne(itemDto.getId());
        return ResponseEntity.ok(item);
    }

    /**
     * Get Items by Category
     *
     * @param itemDto
     * @return
     */
    @RequestMapping(path = WSPath.ITEM_BY_CATEGORY, method = RequestMethod.GET)
    @ResponseBody
    public List<Item> getByCategory(ItemDto itemDto) {

        List<Item> item = itemRepository.findByCategory(itemDto.getItemCategoryId());
        return item;
    }
}
