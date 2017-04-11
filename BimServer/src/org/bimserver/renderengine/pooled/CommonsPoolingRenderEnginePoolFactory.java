package org.bimserver.renderengine.pooled;

/******************************************************************************
 * Copyright (C) 2009-2017  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see {@literal<http://www.gnu.org/licenses/>}.
 *****************************************************************************/

import org.bimserver.plugins.renderengine.RenderEngineException;
import org.bimserver.renderengine.RenderEngineFactory;
import org.bimserver.renderengine.RenderEnginePool;
import org.bimserver.renderengine.RenderEnginePoolFactory;

public class CommonsPoolingRenderEnginePoolFactory implements RenderEnginePoolFactory {

	private int nrRenderEngineProcesses;

	public CommonsPoolingRenderEnginePoolFactory(int nrRenderEngineProcesses) {
		this.nrRenderEngineProcesses = nrRenderEngineProcesses;
	}
	
	@Override
	public RenderEnginePool newRenderEnginePool(RenderEngineFactory renderEngineFactory) throws RenderEngineException {
		return new CommonsRenderEnginePool(nrRenderEngineProcesses, renderEngineFactory);
	}
}
