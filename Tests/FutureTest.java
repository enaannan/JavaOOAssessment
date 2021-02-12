import com.company.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
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
public class FutureTest {

        // mock interface
        @Mock
        IProductPricingService productPricingService;


        @Before
        public void setup(){
            when(productPricingService.price(Mockito.anyString(),Mockito.anyString(),Mockito.anyInt(),Mockito.anyInt())).thenReturn(200.0);
        }

        @Test
        public void testMock (){
            Future future = new Future("A1","UP", "AOL",productPricingService);


            verify(productPricingService).price(Mockito.anyString(),Mockito.anyString(),Mockito.anyInt(),Mockito.anyInt());

        }

        @Test
        public void testStub(){
            Future future = new Future("A1","UP", "AOL",productPricingService);

            Assert.assertEquals(future.getCurrentPrice(),200.0,0.001);

        }



















}

