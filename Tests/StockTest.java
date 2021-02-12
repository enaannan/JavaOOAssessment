import com.company.IProductPricingService;
import com.company.Stock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class StockTest {

    // mocks interface
    @Mock
    IProductPricingService productPricingService;


@Before
    public void setup(){
    when(productPricingService.price(Mockito.anyString(),Mockito.anyString())).thenReturn(100.0);

}

@Test
    public void testMock (){
Stock stock = new Stock("A1","UP", "AOL",productPricingService);


verify(productPricingService).price(Mockito.anyString(),Mockito.anyString());
//    Stock stock = new Stock("A1");
}

@Test
    public void testStub(){
    Stock stock = new Stock("A1","UP", "AOL",productPricingService);
    Assert.assertEquals(stock.getCurrentPrice(),100.0,0.001);

}



}
