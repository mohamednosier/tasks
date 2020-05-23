package softexpert.task.com.Data;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner

import java.util.ArrayList;
import java.util.List;

import softexpert.task.com.Data.data.Data;
import softexpert.task.com.Data.interfaces.MainView;

import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by amit on 3/24/18.
 */
@RunWith(MockitoJUnitRunner.class)
public class MainPresenterImplTest {

    @Mock
    MainView mainView;

    private MainPresenterImpl mainPresenter;

    @Before
    public void setUp() throws Exception {
        mainPresenter = new MainPresenterImpl(mainView);
    }

    @Test
    public void checkIfEQArePassedToView() {
        Data test1 = mock(Data.class);
        Data test2 = mock(Data.class);

        List<Data> list = new ArrayList<Data>(2);
        list.add(test1);
        list.add(test2);

        mainPresenter.onSuccess("sucess",list);
        verify(mainView, times(1)).onGetDataSuccess("success",list);
        verify(mainView, times(1)).hideProgress();

    }

    @Test
    public void checkIfViewIsReleasedOnStop() {
        mainPresenter.onDestroy();
        assertNull(mainPresenter.getMainView());
    }


}