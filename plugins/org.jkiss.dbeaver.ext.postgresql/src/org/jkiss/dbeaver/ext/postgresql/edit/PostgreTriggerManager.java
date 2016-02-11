/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2015 Serge Rieder (serge@jkiss.org)
 * Copyright (C) 2011-2012 Eugene Fradkin (eugene.fradkin@gmail.com)
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License (version 2)
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package org.jkiss.dbeaver.ext.postgresql.edit;

import org.jkiss.dbeaver.ext.postgresql.model.PostgreTrigger;
import org.jkiss.dbeaver.model.impl.edit.AbstractObjectManager;

/**
 * PostgreTriggerManager
 */
public class PostgreTriggerManager extends AbstractObjectManager<PostgreTrigger> {

/*
    @Override
    protected JDBCAbstractCache<PostgreSchema, PostgreTrigger> getObjectsCache(PostgreTrigger object)
    {
        return object.getContainer().getProceduresCache();
    }
*/
}
