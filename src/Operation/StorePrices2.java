package Operation;

import Data.DS_2;
import Data.DataStore;

public class StorePrices2 extends StorePrices {//store prices gp2
	public void StorePrices(DataStore d){
		DS_2 ds=(DS_2)d;
		ds.Rprice = ds.temp_a;
		ds.Dprice = ds.temp_b;
		ds.Sprice = ds.temp_c;
	}
}