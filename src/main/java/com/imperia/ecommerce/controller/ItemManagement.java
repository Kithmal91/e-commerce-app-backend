package com.imperia.ecommerce.controller;

import com.imperia.ecommerce.common.WSPath;
import com.imperia.ecommerce.dto.ItemDto;
import com.imperia.ecommerce.dto.response.ItemResponse;
import com.imperia.ecommerce.entity.ImageBank;
import com.imperia.ecommerce.entity.Item;
import com.imperia.ecommerce.repository.CategoryRepository;
import com.imperia.ecommerce.repository.ImageBankRepository;
import com.imperia.ecommerce.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * All the operations regarding items Created by Kithmal on 12/29/17.
 */
@RequestMapping(WSPath.ITEM)
@RestController
public class ItemManagement {

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    ImageBankRepository imageBankRepository;

    /**
     * Save Item
     *
     * @param itemDto
     * @return
     */
    @RequestMapping(path = WSPath.ITEM_SAVE, method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Item> save(@RequestBody ItemDto itemDto) {

        Item item = null;
        ImageBank bank = null;

        if (itemDto.getId() != null) {
            item = itemRepository.findOne(itemDto.getId());
            if (null != item) {
                if (null != itemDto.getImagePath()) {
                    bank = imageBankRepository.findOne(itemDto.getReferenceId());
                    if (null != bank) {
                        bank.setId(itemDto.getReferenceId());
                        bank.setDescription(itemDto.getDescription());
                        bank.setImagePath(itemDto.getImagePath());
                        bank.setStatus(itemDto.getStatus());
                        item.setImageBank(bank);
                        imageBankRepository.save(bank);
                    } else {
                        bank = new ImageBank();
                        bank.setId(itemDto.getReferenceId());
                        bank.setDescription(itemDto.getDescription());
                        bank.setImagePath(itemDto.getImagePath());
                        bank.setStatus(itemDto.getStatus());
                        try {
                            ImageBank exBank = imageBankRepository.save(bank);
                            item.setImageBank(exBank);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
                item.setDescription(itemDto.getDescription());
                item.setStatus(itemDto.getStatus());
                item.setDiliveryStatus(itemDto.getDiliveryStatus());
                //  item.setHeight(itemDto.getHeight());
                item.setItemName(itemDto.getItemName());
                item.setQuantity(itemDto.getQuantity());
                item.setReferenceId(itemDto.getReferenceId());
                item.setCost(itemDto.getCost());
                item.setDiscount(itemDto.getDiscount());
                item.setRetailPrice(itemDto.getRetailPrice());
                item.setWeight(itemDto.getWeight());
                //    item.setWidth(itemDto.getWidth());
                item.setCategory(categoryRepository.findOne(itemDto.getItemCategoryId()));
            }
        } else {
            item = new Item();
            if (null != itemDto.getImagePath()) {
                bank = imageBankRepository.findOne(itemDto.getReferenceId());
                if (null != bank) {
                    bank.setId(itemDto.getReferenceId());
                    bank.setDescription(itemDto.getDescription());
                    bank.setImagePath(itemDto.getImagePath());
                    bank.setStatus(itemDto.getStatus());
                    item.setImageBank(bank);
                    imageBankRepository.save(bank);
                } else {
                    bank = new ImageBank();
                    bank.setId(itemDto.getReferenceId());
                    bank.setDescription(itemDto.getDescription());
                    bank.setImagePath(itemDto.getImagePath());
                    bank.setStatus(itemDto.getStatus());
                    item.setImageBank(bank);
                    imageBankRepository.save(bank);
                }
            }
            item.setDescription(itemDto.getDescription());
            item.setStatus(itemDto.getStatus());
            item.setDiliveryStatus(itemDto.getDiliveryStatus());
            //  item.setHeight(itemDto.getHeight());
            item.setItemName(itemDto.getItemName());
            item.setQuantity(itemDto.getQuantity());
            item.setReferenceId(itemDto.getReferenceId());
            item.setCost(itemDto.getCost());
            item.setDiscount(itemDto.getDiscount());
            item.setRetailPrice(itemDto.getRetailPrice());
            item.setWeight(itemDto.getWeight());
            //    item.setWidth(itemDto.getWidth());
            item.setCategory(categoryRepository.findOne(itemDto.getItemCategoryId()));
        }

        Item exItem = itemRepository.save(item);
        return ResponseEntity.ok(exItem);
    }

    /**
     * Get All the items
     *
     * @return
     */
    @RequestMapping(path = WSPath.ITEM_BY_CATEGORY, method = RequestMethod.GET)
    @ResponseBody
    public List<Item> getByCategory() {

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
    @RequestMapping(path = WSPath.IMAGE_GET_ALL, method = RequestMethod.GET)
    @ResponseBody
    public ItemResponse getAll(ItemDto itemDto) {

        Iterable<Item> itemList = itemRepository.findAll();
        List<Item> list = new ArrayList<>();
        itemList.forEach(list::add);
        ItemResponse response = new ItemResponse();

        List<ItemDto> dtos = new ArrayList<>();
        for (Item item : list) {
            ItemDto dto = new ItemDto();
            dto.setId(item.getId());
            dto.setWidth(item.getWidth());
            dto.setWeight(item.getWeight());
            dto.setHeight(item.getHeight());
            dto.setReferenceId(item.getReferenceId());
            dto.setDiscount(item.getDiscount());
            dto.setCost(item.getCost());
            dto.setRetailPrice(item.getRetailPrice());
            if (null != item.getImageBank()) {
                dto.setImagePath(item.getImageBank().getImagePath());
            }
            dto.setItemCategoryId(item.getCategory().getId());
            dto.setMainCategory(item.getCategory().getMainCategory());
            dto.setDescription(item.getDescription());
            dto.setStatus(item.getStatus());
            dto.setDiliveryStatus(item.getDiliveryStatus());
            dto.setItemName(item.getItemName());
            dto.setItemCategoryName(item.getCategory().getCategoryName());
            dto.setQuantity(item.getQuantity());
            dtos.add(dto);
        }
        response.setDtos(dtos);
        return response;
    }
}
