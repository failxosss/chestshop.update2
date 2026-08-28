package org.simpleshop;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

/**
 * Marker holder for the read-only "peek inside the shulker box" GUI that
 * opens when a player right-clicks a shulker box shop display item.
 * Any inventory using this holder is purely a preview - all clicks in it
 * are cancelled so nothing can be taken out or duplicated.
 */
public class ShulkerPreviewHolder implements InventoryHolder {

    private Inventory inventory;

    @Override
    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
