package InMemoryModel;

import java.util.List;
import ModelElements.PoligonalModel;
import ModelElements.Scene;
import ModelElements.Flash;
import ModelElements.Camera;

public class ModelStore implements IModelChanger{
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private List<IModelChangeObserver> changeObservers;

    public Scene GetScena(int number){
        Scene scene = new Scene(); 
        return (Scene) scene;
    }
    public void NotifyChange(IModelChanger sender){}
}
