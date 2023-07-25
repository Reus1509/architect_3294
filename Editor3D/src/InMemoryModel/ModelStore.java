package InMemoryModel;

import java.util.ArrayList;
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
    private IModelChangeObserver[] changeObservers;
    public ModelStore(IModelChangeObserver[] changeObservers) {
        this.changeObservers = changeObservers;
        this.models = new ArrayList<PoligonalModel>();
        this.scenes = new ArrayList<Scene>();
        this.cameras = new ArrayList<Camera>();
        this.flashes = new ArrayList<Flash>();
    }

    public Scene GetScena(int number){
        Scene scene = new Scene(); 
        return (Scene) scene;
    }
    public void NotifyChange(IModelChanger sender){}
}
