package net.sf.jabref.gui.actions.bibsonomy;

import java.awt.event.ActionEvent;

import net.sf.jabref.bibsonomy.BibSonomyProperties;
import net.sf.jabref.gui.JabRefFrame;
import net.sf.jabref.gui.bibsonomy.SearchType;
import net.sf.jabref.gui.worker.bibsonomy.ImportPostsByCriteriaWorker;

import org.bibsonomy.common.enums.GroupingEntity;


/**
 * {@link ImportAllMyPostsAction} runs the {@link ImportPostsByCriteriaWorker} to import all posts of the user.
 *
 * @author Waldemar Biller <biller@cs.uni-kassel.de>
 */
public class ImportAllMyPostsAction extends AbstractBibSonomyAction {

    public ImportAllMyPostsAction(JabRefFrame jabRefFrame) {
        super(jabRefFrame);
    }

    public void actionPerformed(ActionEvent e) {
        ImportPostsByCriteriaWorker worker = new ImportPostsByCriteriaWorker(getJabRefFrame(), "", SearchType.FULL_TEXT, GroupingEntity.USER, BibSonomyProperties.getUsername(), true);
        performAsynchronously(worker);
    }

}
