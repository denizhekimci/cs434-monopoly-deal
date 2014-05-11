using System;
using System.Collections.Generic;
using System.Text;

namespace MonopolyDealGame
{
    public abstract class Card
    {
        public abstract void returnToSource();
        public abstract void draw();
        public abstract String source();
        public abstract void setSource(Deck source);
    }
}
