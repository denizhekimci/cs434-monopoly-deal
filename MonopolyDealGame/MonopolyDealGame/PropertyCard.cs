using System;
using System.Collections.Generic;
using System.Text;

namespace MonopolyDealGame
{
    class PropertyCard:Card
    {
        public PropertyCard()
        {
        }

        public override string source()
        {
            throw new NotImplementedException();
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
