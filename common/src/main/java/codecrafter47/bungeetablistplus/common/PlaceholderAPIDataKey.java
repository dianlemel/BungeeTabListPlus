/*
 * BungeeTabListPlus - a BungeeCord plugin to customize the tablist
 *
 * Copyright (C) 2014 - 2015 Florian Stober
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package codecrafter47.bungeetablistplus.common;

import codecrafter47.bungeetablistplus.data.DataKey;

public class PlaceholderAPIDataKey extends DataKey<String> {
    private final String placeholder;

    private static final long serialVersionUID = 1L;

    public PlaceholderAPIDataKey(String placeholder) {
        super("placeholderAPI", Scope.PLAYER);
        this.placeholder = placeholder;
    }

    public String getPlaceholder() {
        return placeholder;
    }
}
