using System;
using System.Collections.Generic;
using System.Text;

namespace MonopolyDealGame
{
    abstract class ActionCard:Card
    {
        protected List<Card> cards = new List<Card>();
        public ActionCard()
        {
            
            for (int i = 0; i < 4; i++)
            {
                //add cards
            }
        }

        public override void draw()
        {
            throw new NotImplementedException();
        }

        public override void returnToSource()
        {
            throw new NotImplementedException();
        }
        public override void setSource(Deck source)
        {
            throw new NotImplementedException();
        }
        public override string ToString()
        {
            return base.ToString();
        }
    }
}
