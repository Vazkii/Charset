/*
 * Copyright (c) 2015-2016 Adrian Siekierka
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package pl.asie.charset.gates;

import net.minecraft.util.EnumFacing;

public class PartGateRSLatch extends PartGate {
	@Override
	public boolean canBlockSide(EnumFacing side) {
		return false;
	}

	@Override
	public boolean canInvertSide(EnumFacing side) {
		return false;
	}

	@Override
	public Connection getType(EnumFacing dir) {
		return dir == EnumFacing.NORTH ? Connection.OUTPUT : Connection.INPUT;
	}

	@Override
	public State getLayerState(int id) {
		switch (id) {
			case 3:
				return State.input(getValueInside(EnumFacing.EAST));
			case 2:
				return State.input(getValueInside(EnumFacing.WEST));
			case 1:
				return State.input(getValueInside(EnumFacing.NORTH));
			case 0:
				return State.input(getValueInside(EnumFacing.SOUTH));
		}
		return null;
	}

	@Override
	public State getTorchState(int id) {
		switch (id) {
			case 0:
				return State.input(getValueInside(EnumFacing.WEST));
			case 1:
				return State.input(getValueInside(EnumFacing.EAST));
		}
		return null;
	}

	@Override
	public byte calculateOutputInside(EnumFacing facing) {
		if (getValueInside(EnumFacing.SOUTH) > 0 && getValueInside(EnumFacing.WEST) > 0 && getValueInside(EnumFacing.EAST) == 0 || getValueInside(EnumFacing.SOUTH) > 0 && getValueInside(EnumFacing.WEST) == 0 && getValueInside(EnumFacing.EAST) == 0 || getValueInside(EnumFacing.SOUTH) == 0 && getValueInside(EnumFacing.WEST) > 0 && getValueInside(EnumFacing.EAST) == 0) {
			return 15;
		}
		return 0;
	}
}
