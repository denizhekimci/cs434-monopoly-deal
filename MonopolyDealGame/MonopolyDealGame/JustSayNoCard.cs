using System;
using System.Collections.Generic;
using System.Text;

namespace MonopolyDealGame
{
    class JustSayNoCard : ActionCard
    {
        public JustSayNoCard()
        {
        }

        public override void draw()
        {
            base.draw();
        }
        public override string ToString()
        {
            return base.ToString();
        }
        public override void setSource(Deck source)
        {
            base.setSource(source);
        }
        public override string source()
        {
            throw new NotImplementedException();
        }
        public override void returnToSource()
        {
            base.returnToSource();
        }
    }
}
