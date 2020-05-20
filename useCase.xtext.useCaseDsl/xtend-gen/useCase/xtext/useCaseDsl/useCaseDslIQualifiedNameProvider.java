package useCase.xtext.useCaseDsl;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import useCase.xtext.useCaseDsl.useCaseDsl.Extension;
import useCase.xtext.useCaseDsl.useCaseDsl.UseCase;
import useCase.xtext.useCaseDsl.useCaseDsl.UseCaseDslPackage;

@SuppressWarnings("all")
public class useCaseDslIQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
  @Inject
  private IQualifiedNameConverter converter = new IQualifiedNameConverter.DefaultImpl();
  
  @Override
  public QualifiedName getFullyQualifiedName(final EObject obj) {
    if ((obj instanceof Extension)) {
      final List<INode> nodes = NodeModelUtils.findNodesForFeature(obj, 
        UseCaseDslPackage.Literals.EXTENSION__START_FROM);
      for (final INode node : nodes) {
        {
          final String text = NodeModelUtils.getTokenText(node);
          if ((text != null)) {
            EObject a = ((Extension)obj).eContainer();
            String _name = ((UseCase) a).getName();
            String _plus = (_name + ".");
            String _plus_1 = (_plus + text);
            String _plus_2 = (_plus_1 + ".");
            String _name_1 = ((Extension) obj).getName();
            String FN = (_plus_2 + _name_1);
            return this.converter.toQualifiedName(FN);
          }
        }
      }
    }
    return super.getFullyQualifiedName(obj);
  }
}
