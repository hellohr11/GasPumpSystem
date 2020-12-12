package Operation;

import Data.DS_1;
import Data.DataStore;

public class StorePrices1 extends StorePrices {//store prices gp1
	public void StorePrices(DataStore d){
		DS_1 ds=(DS_1)d;
		ds.price = ds.temp_a;
	}
}